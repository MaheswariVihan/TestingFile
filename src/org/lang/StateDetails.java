package org.lang;

public class StateDetails {
	public void southIndia() {
		System.out.println("southIndia:90 %") ;
		}
		public void northIndia() {
			System.out.println("northIndia:79 %") ;
			}

		public static void main(String[] args) {
			StateDetails sd= new StateDetails();
			sd.southIndia();
			sd.northIndia();
			LanguageInfo li=new LanguageInfo();
			li.tamilLanguage();
			li.englishLanguage();
			li.hindiLanguage();
		}
}
