package sorting1.assignment2;

public class EmplyeeSortingMain {


    public static void bsortEmp(Employee[] emp){
        for (int i=0; i<emp.length-1; i++){
            for(int j=0; j< emp.length-1-i; j++){
                if(emp[j].isGreterSal(emp[j+1])){
                    Employee temp = emp[j];
                    emp[j] = emp[j+1];
                    emp[j+1] = temp;
                }
            }
        }
    }
    public static void ssortEmp(Employee[] arr){
        for(int i=0; i<arr.length; i++){
            Employee mini = arr[i];
            int index = i;

            for(int j=i+1; j<arr.length; j++){
                if(mini.isGreterSal(arr[j])){
                    mini = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = mini;
        }
    }

    public static void main(String[] args) {
        Employee []emp = {
                new Employee(101,"Employee1",1000),
                new Employee(101,"Employee2",5000),
                new Employee(102,"Employee3",4000),
                new Employee(103,"Employee4",1000),
                new Employee(104,"Employee5",3000),
                new Employee(105,"Employee6",2000)
        };

        System.out.println("Employee before sorting: ");
        for(Employee e: emp){
            System.out.println(e);
        }
        ssortEmp(emp);
        System.out.println("Employee after sorting according to salary: ");
        for(Employee e: emp){
            System.out.println(e);
        }

    }
}
