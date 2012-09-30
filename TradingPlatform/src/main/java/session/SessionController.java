package session;

import java.util.Scanner;

import account.Account;

public class SessionController {
	Account account;
	
	private Scanner scanner = new Scanner(System.in);
	
		 public boolean login(){
		    	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		    	System.out.println("$                                                                                                                                                               $");
		    	System.out.println("$                                                                                                                                                               $");
		    	System.out.print("$\tTTTTTTTTTTTTTT   RRRRRRRRRRRRRRRR                AAAAAA          DDDDDDDDDDD        IIIIIIIIIII    NNNN     NNNN   GGGGGGGG\t\t\t\t$\n");
		    	System.out.print("$\tTTTTTTTTTTTTTT   RRRRRRRRRRRRRRRRR              AAAAAAAA         DDDDDDDDDDDDD      IIIIIIIIIII    NNNNN    NNNN   GGGGGGGGGG\t\t\t\t$\n");
		    	System.out.print("$\t    TTTTT        RRRRR      RRRRRRR            AAAAAAAAAA        DDDD      DDDD        IIIII       NNNNNN   NNNN   GGGG        \t\t\t\t$\n");
		    	System.out.print("$\t    TTTTT        RRRRR      RRRRRRR           AAAA    AAAA       DDDD      DDDDD       IIIII       NNNNNNN  NNNN   GGGG        \t\t\t\t$\n");
		    	System.out.print("$\t    TTTTT        RRRRRRRRRRRRRRRR            AAAAA    AAAAA      DDDD      DDDDD       IIIII       NNNN  NNNNNNN   GGGG    GGGG\t\t\t\t$\n");
		    	System.out.print("$\t    TTTTT        RRRRRRRRRRRRRRRR           AAAAAAAAAAAAAAAA     DDDD      DDDDD       IIIII       NNNN   NNNNNN   GGGG     GGG\t\t\t\t$\n");
		    	System.out.print("$\t    TTTTT        RRRRR      RRRRRR         AAAAAAAAAAAAAAAAAA    DDDD      DDDD        IIIII       NNNN    NNNNN   GGGG     GGG\t\t\t\t$\n");
		    	System.out.print("$\t    TTTTT        RRRRR        RRRRR       AAAAA          AAAAA   DDDDDDDDDDDDD      IIIIIIIIIII    NNNN     NNNN   GGGGGGGGGGGG\t\t\t\t$\n");
		    	System.out.print("$\t    TTTTT        RRRRR         RRRRR     AAAAA            AAAAA  DDDDDDDDDDDD       IIIIIIIIIII    NNNN      NNN    GGGGGGGGGGG\t\t\t\t$\n");
		    	System.out.println("$                                                                                                                                                            \t$");
		    	System.out.println("$                                                                                                                                                            \t$");
		    	System.out.print("$\tPPPPPPPPPPPP     LLLLL                      AAAAA         TTTTTTTTTTTTTT    FFFFFFFFFFFF     OOOOOOOO     RRRRRRRRRRRRRR       MMM          MMM \t$\n");
		    	System.out.print("$\tPPPPPPPPPPPPP    LLLLL                     AAAAAAA        TTTTTTTTTTTTTT    FFFFFFFFFFFF    OOOOOOOOOO    RRRRRRRRRRRRRRR      MMMM        MMMM\t\t$\n");
		    	System.out.print("$\tPPP       PPPP   LLLLL                    AAAAAAAAA           TTTTT         FFFF            OOO    OOO    RRRRR     RRRRRR     MMMMM      MMMMM \t$\n");
		    	System.out.print("$\tPPP       PPPP   LLLLL                   AAAA   AAAA          TTTTT         FFFF            OOO    OOO    RRRRR     RRRRRR     MMMMMM    MMMMMM\t\t$\n");
		    	System.out.print("$\tPPP       PPPP   LLLLL                  AAAA     AAAA         TTTTT         FFFFFFFFFFF     OOO    OOO    RRRRR     RRRRR      MMMMMMMMMMMMMMMM\t\t$\n");
		    	System.out.print("$\tPPPPPPPPPPPPP    LLLLL                 AAAAA     AAAAA        TTTTT         FFFFFFFFFFF     OOO    OOO    RRRRRRRRRRRRRR       MMMMMMMMMMMMMMMM\t\t$\n");
		    	System.out.print("$\tPPPPPPPPPPP      LLLLL                AAAAAAAAAAAAAAAAA       TTTTT         FFFF            OOO    OOO    RRRRRRRRRRRRRR       MMMM   MM   MMMM\t\t$\n");
		    	System.out.print("$\tPPPP             LLLLL               AAAAAAAAAAAAAAAAAAA      TTTTT         FFFF            OOO    OOO    RRRRR     RRRRR      MMMM        MMMM\t\t$\n");
		    	System.out.print("$\tPPPP             LLLLLLLLLLLLL      AAAAA           AAAAA     TTTTT         FFFF            OOOOOOOOOO    RRRRR      RRRRR     MMMM        MMMM\t\t$\n");
		    	System.out.print("$\tPPPP             LLLLLLLLLLLLL     AAAAA             AAAAA    TTTTT         FFFF             OOOOOOOO     RRRRR       RRRRR    MMMM        MMMM\t\t$\n");
		    	System.out.println("$                                                                                                                                                               $");
		    	System.out.println("$                                                                                                                                                               $");
		    	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		    	
		    	System.out.print("\n\n\nLogin:");
		    	String username = scanner.next();
		    	System.out.print("Password:");
		    	String password = scanner.next();
		    	boolean verified = verifyUser(username, password);
		    	return verified;
		    	

	}
		 
		 public boolean verifyUser(String username, String password){
			 return true;	    	
		    }


}
