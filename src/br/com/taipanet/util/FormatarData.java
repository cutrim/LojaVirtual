package br.com.taipanet.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatarData {
	public FormatarData() {
		// TODO Auto-generated constructor stub
	}
	
	public String formatarData(Calendar data){
		Date data01 = data.getTime();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		return formato.format(data01);
	}
}
