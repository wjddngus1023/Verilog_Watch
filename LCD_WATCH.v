
module LCD_WATCH(
	RESETN,CLK,
	H10,H1,M10,M1,S10,S1
	
);






input RESETN,CLK;
wire [3:0]H10,H1,M10,M1,S10,S1;
integer CNT;
integer CNT_SCAN;

reg[6:0]HOUR,MIN,SEC;
output [3:0]H10,H1,M10,M1,S10,S1;
reg[3:0]NUM;



always @(posedge CLK)
begin  // CNT 생성
	if(~RESETN)
		CNT=0;
	else
		begin
			if(CNT>=999)
				CNT=0;
			else
				CNT=CNT+1;
		end
end

always @(posedge CLK)
begin	// SEC연산
	if(~RESETN)
		SEC=0;
	else
		begin
			if(CNT==999)
				begin
					if(SEC>=59)
						SEC=0;
					else
						SEC=SEC+1;
				end
		end
end

always @(posedge CLK)
begin  // MIN 연산
	if(~RESETN)
		MIN=0;
	else
		begin
			if((CNT==999)&&(SEC==59))
				begin
					if(MIN>=59)
						MIN=0;
					else
						MIN=MIN+1;
				end
		end
end

always @(posedge CLK)
begin  // HOUR연산
	if(~RESETN)
		HOUR=0;
	else
		begin
			if((CNT==999)&&(SEC==59)&&(MIN==59))
				begin
					if(HOUR>=23)
						HOUR=0;
					else
						HOUR=HOUR+1;
				end
		end
end


LCD_WATCH_SEP S_SEP(SEC,S10,S1);
LCD_WATCH_SEP M_SEP(MIN,M10,M1);
LCD_WATCH_SEP H_SEP(HOUR,H10,H1);



endmodule