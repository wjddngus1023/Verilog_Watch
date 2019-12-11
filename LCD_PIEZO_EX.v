//LCD_PIEZO_EX.V

module LCD_PIEZO_EX(
	RESETN,CLK,
	PIEZO
);

input RESETN,CLK;
output PIEZO;

reg BUFF;
integer CNT_SOUND;
integer LIMIT;

wire PIEZO;



	always @(posedge CLK)
	begin
		if(~RESETN)
			begin
				BUFF = 1'b0;
				CNT_SOUND = 0;
			end
		else
			begin
				if(CNT_SOUND >= LIMIT)
					begin
						CNT_SOUND = 0;
						BUFF = ~BUFF;
					end	
				else
					CNT_SOUND = CNT_SOUND + 1;
			end
	end

assign PIEZO = BUFF;

endmodule	