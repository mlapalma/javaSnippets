
public class Student extends Person{

        private int[] testScores;

        /*
         *   Class Constructor
         *
         *   @param firstName - A string denoting the Person's first name.
         *   @param lastName - A string denoting the Person's last name.
         *   @param id - An integer denoting the Person's ID number.
         *   @param scores - An array of integers denoting the Person's test scores.
         */
        // Write your constructor here
        Student(String firstName, String lastName, int id, int[] scores){
            super(firstName,lastName,id);
            this.testScores = scores;
        }
        /*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         */
        // Write your method here
        public String calculate() {
            int sum = 0;
            for (int x = 0; x < testScores.length; x++)
                sum += testScores[x];

            int result = sum / testScores.length;

            if (result >= 90 && result <= 100)
                return "O";
            if (result >= 80 && result < 90)
                return "E";
            if (result >= 70 && result < 80)
                return "A";
            if (result >= 55 && result < 70)
                return "P";
            if (result >= 40 && result < 55)
                return "D";

            return "T";
        }

}
