package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		String input = showInputDialog("Din lønn: ");
		int førSkatt = Integer.parseInt(input);
		double skatt = 0;
		double trinn1 = (292850-208051)*0.017;  
		double trinn2 = (670000-292851)*0.04; 
		double trinn3 = (937900-670001)*0.136; 
		double trinn4 = (1350000-937900)*0.166;  
												  
		if (førSkatt <=208050) {
			showMessageDialog(null,"Du tjener for lite for trinnskatt.");
		}
		else if ((førSkatt >= 208051)&&(førSkatt<=292850)) {
			 skatt = (førSkatt-208050) * 0.017;
		}
		
		else if ((førSkatt >= 292851)&&(førSkatt<=670000)) {
			 skatt = trinn1+(førSkatt-292850)*0.04;	
		}
		
		else if ((førSkatt >= 670001)&&(førSkatt<=937900)) {
			 skatt =trinn1+trinn2+
					(førSkatt-670000)*0.136;
		}
		
		else if ((førSkatt >= 937901)&&(førSkatt<=1350000)) {
			 skatt =trinn1+trinn2+trinn3+
					(førSkatt-937900)*0.166;
		}
		
		else if (førSkatt >= 1350001){
			skatt =trinn1+trinn2+trinn3+trinn4+
                   (førSkatt-1350000)*0.176;
			
			
		}
		
		showMessageDialog(null, "Du må betale " + skatt +" kr i skatt.");

	}

}