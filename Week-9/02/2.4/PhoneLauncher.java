public class PhoneLauncher {
	public static void main(String [] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		//launcher.launch();
		SmartPhone htc = new SmartPhone("htc");
		
		launcher.testPhone(htc);
	}
	
	public void launch() {
		
		//Old phone test
OldPhone rotary = new OldPhone("rotary");
		rotary.call("01516794738");
		
		//Mobile phone test 
		MobilePhone nokia3210 = new MobilePhone("nokia");
		nokia3210.call("0747398272");
		nokia3210.ringAlarm("7.30am");
		nokia3210.playGame("Snake");
		nokia3210.printLastNumbers();
		

		SmartPhone htc = new SmartPhone("htc");
		htc.call("0047462");
		htc.call("0164748489");
		htc.browseWeb("google.com");
		htc.findPosition();
		
	}
			//2.4 
		public void testPhone(Phone phone) {
		  SmartPhone tester = (SmartPhone) phone;
		  tester.call("0151647290");
		  tester.browseWeb("google.com");
		  tester.findPosition();
		  tester.playGame("Tetris");
		}
}
