package core.less7.homework;

import static core.less7.homework.University.*;

public enum Faculty {

	FOREIGN_LANGUAGE(NUIF),CHEMIST(NUIF), HISTORY(NUIF), ECONOMY(NUIF),
	FOREIGN_LANGUAGE1(LP), CHEMIST1(LP), HISTORY1(LP), ECONOMY1(LP);
	
	
	private final University university;

	private Faculty(University university) {
		this.university = university;
	}

	public University getUniversity() {
		return university;
	}
	
}
