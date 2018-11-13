package com.df.factory;

import com.df.beans.Computer;
import com.df.beans.PC;
import com.df.beans.Server;

public class ComputerFactory {

	public static Computer getComputerInstance(ComputerType type,String ram,String hdd,String cpu) {
		Computer computer=null;
		switch(type) {
		case PC:
			computer =new PC(ram,hdd,cpu);
			break;
		case SERVER:
			computer =new Server(ram, hdd, cpu);
			break;
		}
		return computer;
	}
}
