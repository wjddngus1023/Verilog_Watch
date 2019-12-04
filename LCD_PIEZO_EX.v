//LCD_PIEZO_EX.V

module LCD_PIEZO_EX(
	RESETN,CLK,
	KEY,
	PIEZO
);

input RESETN,CLK;
input [7:0] KEY;
output PIEZO;

reg BUFF;
integer CNT_SOUND;
integer LIMIT;

wire PIEZO;

always @(KEY)
begin
		case(KEY)
			8'b10000000 : LIMIT = 190; //C
			8'b01000000 : LIMIT = 169; //D
			8'b00100000 : LIMIT = 151; //E
			8'b00010000 : LIMIT = 142; //F
			8'b00001000 : LIMIT = 127; //G
			8'b00000100 : LIMIT = 113; //A
			8'b00000010 : LIMIT = 100; //B
			8'b00000001 : LIMIT = 95; //HIGH C
			default : LIMIT = 0;
		endcase
	end

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