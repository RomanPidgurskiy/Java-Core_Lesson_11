package ua.lviv.lgs.Lesson_11_2;

import java.util.Comparator;

public class Sort implements Comparator<Auto> {

	@Override
	public int compare(Auto arg0, Auto arg1) {
		// TODO Auto-generated method stub
		return arg1.getHorsepower()-arg0.getHorsepower();
	}

}
