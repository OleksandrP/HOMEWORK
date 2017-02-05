package core.less7.homework;

import static core.less7.homework.Faculty.*;
import static core.less7.homework.University.*;


public enum Group {

	FORLAN1(31, FOREIGN_LANGUAGE,NUIF), FORLAN2(30, FOREIGN_LANGUAGE,NUIF), FORLAN3(
			29, FOREIGN_LANGUAGE,NUIF), FORLAN4(25, FOREIGN_LANGUAGE,NUIF), FORLN_0(
			30, FOREIGN_LANGUAGE1,LP), FORLN_1(29, FOREIGN_LANGUAGE,LP), FORLN_2(
			30, FOREIGN_LANGUAGE1,LP), FORLN_3(31, FOREIGN_LANGUAGE1,LP), FORLN_4(
			31, FOREIGN_LANGUAGE,LP), CHEM(25, CHEMIST,NUIF), CHEM1(23,
			CHEMIST,LP), CHEM2(24, CHEMIST,NUIF), CHEM_11(20, CHEMIST1,LP), CHEM_12(
			25, CHEMIST1,LP), CHEM_13(24, CHEMIST1,LP), CHEM_14(25, CHEMIST1,LP), HIST_1A(
			24, HISTORY,NUIF), HIST_1B(24, HISTORY,NUIF), HIST_1C(24,
			HISTORY,NUIF), HIST_1(24, HISTORY1,LP), HIST_2(25, HISTORY1,LP), HIST_3(
			26, HISTORY1,LP), HIST_4(26, HISTORY1,LP), ECONOM(28, ECONOMY1,NUIF), ECONOM_1(
			26, ECONOMY,NUIF), ECONOM_2(28, ECONOMY,NUIF), ECONOM_3(29,
			ECONOMY,NUIF), ECONOM_1A(27, ECONOMY1,LP), ECONOM_1B(26, ECONOMY1,LP), ECONOM_1C(28, ECONOMY1,LP), ECONOM_1D(27, ECONOMY1,LP);

	private final int valueStudent;

	private final Faculty faculty;
	
	private final University university;

	public int getValueStudent() {
		return valueStudent;
	}

	public Faculty getFaculty() {
		return faculty;
	}
	
	public University getUniversity() {
		return university;
	}
	
	private Group(int valueStudent, Faculty faculty, University university) {
		this.valueStudent = valueStudent;
		this.faculty = faculty;
		this.university = university;
	}
	
}


