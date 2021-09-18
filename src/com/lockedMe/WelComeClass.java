package com.lockedMe;

public class WelComeClass {
	public static void WelcomeMethod(String applicationName, String developerName) {
		String companyDetails = String.format("*********************************************\n"
				+ "** Welcome to %s.com. \n" + "**Application was developed by %s.\n"
				+ "*********************************************\n", applicationName, developerName);
		String applicationFunction = "Use this application to :-\n"
				+ "Retrieve all file names in the \"Main\" Folder\n"
				+ "Create, Search, or delete files in \"Main\" Folder.\n"
				+ "\n**Please give correct filename for searching or deleting files.**\n";
		System.out.println(companyDetails);

		System.out.println(applicationFunction);
		}
		public static void HomeMenu() {
			String menu = "\n\n****** Select any number from below and press Enter ******\n\n"
					+ "1  Retrieve all files inside \"Main\" Folder\n" 
					+ "2  Display menu for File operations\n"
					+ "3  Exit program\n";
			System.out.println(menu);
		}
		public static void  DisplayMenu() {
			String fileMenu = "\n\n****** Select any number from below and press Enter ******\n\n"
					+ "1 Create a file to \"Main\" Folder\n" 
					+ "2 Search a file from \"Main\" Folder\n"
					+ "3 Delete for a file from \"Main\" Folder\n" 
					+ "4 Exit program\n";
			System.out.println(fileMenu);
		}

}

