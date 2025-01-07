package ch.tbz;



public class grid {

    private String[][] layout;

    public grid() {
        layout = new String[3][3];

        for (int i = 0; i<3; i++ ){
            for (int j = 0; j<3; j++){
                layout[i][j] = "...";
            }
        }
    }

    public void displayLayout(){

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(layout[i][j] + " ");
            }
            System.out.println();
        }
    }



    public String[][] getLayout(){
        return layout;
    }



}
