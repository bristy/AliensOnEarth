package com.register.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.register.alien.exportformat.BaseExportFormat;
import com.register.alien.model.AlienModel;

public class Main {
	public static void main(String[] argv) {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Register an Alien-----------------------");
		AlienModel alien = new AlienModel();

		try {
			// get alien data from user
			System.out.println("Input Alien Code Name:");
			alien.setCodeName(bufferedReader.readLine());
			System.out.println("Input Alien Blood Color");
			alien.setBloodColor(bufferedReader.readLine());
			System.out.println("Input Alien Home Planet:");
			alien.setHomePlanet(bufferedReader.readLine());
			System.out.println("Input Alien No of Antennas:");
			alien.setNoOfAntenna(Integer.parseInt(bufferedReader.readLine()));
			System.out.println("Input Alien No of Legs:");
			alien.setNoOfLegs(Integer.parseInt(bufferedReader.readLine()));

			// get User preference for exporting
			System.out.println("Input Export Preferences------------------");
			System.out.println("Exit Code : " + CommonConstant.EXIT_CODE);
			System.out.println("TEXT : " + CommonConstant.TEXT);
			System.out.println("PDF : " + CommonConstant.PDF);
			int userInput = CommonConstant.TEXT; // default is text
			String inp;
			boolean flag = true; // to loop more
			do {
				inp = bufferedReader.readLine();
				if (isNumber(inp)) {
					userInput = Integer.parseInt(inp);
					if (userInput == CommonConstant.EXIT_CODE) {
						flag = false;
					} else {
						BaseExportFormat format = ExportFactory
								.getExportFormat(userInput, alien);
						if (null != format) {
							flag = false;
							format.export();
						} else {
							flag = true;
							System.out.println("Wrong Choice! Try Again :)");
						}
					}

				} else {
					flag = true;
					System.out.println("Wrong Choice! Try Again :)");
				}
			} while (flag);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static boolean isNumber(String str) {
		if (null != str) {
			try {
				Integer.parseInt(str);
			} catch (NumberFormatException nfe) {
				return false;
			}
			return true;
		}
		return false;
	}
}
