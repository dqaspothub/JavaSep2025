package controlFlow;

import javax.swing.*;

public class IfElseifConditionExample {

	public static void main(String[] args) {

		int marks = 18;

		if (marks >= 90) {
			System.out.println("Grade A");
		} else if (marks >= 75) {
			System.out.println("Grade B");
		} else if (marks >= 50) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail");
		}

	}

}


