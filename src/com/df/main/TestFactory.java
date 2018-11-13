package com.df.main;

import com.df.beans.Computer;
import com.df.factory.ComputerFactory;
import com.df.factory.ComputerType;

public class TestFactory {

	public static void main(String[] args) {

		Computer pc=ComputerFactory.getComputerInstance(ComputerType.PC, "8 GB", "750 GB", "2.4 GHZ");
		Computer serverObj=ComputerFactory.getComputerInstance(ComputerType.SERVER, "32 GB", "2 TB", "3.4 G Hz");
		System.out.println(pc);
		System.out.println(serverObj);
	}

}
