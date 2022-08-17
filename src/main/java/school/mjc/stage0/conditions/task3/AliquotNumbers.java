package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        int s=0;
        for(int i = 1; i<=(first / 2); i++){
            if(first%i == 0)
                s+=i;
        }
        if(s==second)
            System.out.println("Aliquot");
        else
            System.out.println("Not aliquot");
    }
}
