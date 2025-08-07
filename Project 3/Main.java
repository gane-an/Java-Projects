import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        List<College> studentsList=new ArrayList<>();

        int choice ;
        while(true){
            System.out.println("Enter the choice:");
            System.out.println("1.Insert the student detail");
            System.out.println("2.Display each student details");
            System.out.println("3.Search the Student");
            System.out.println("4.Exit");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:{
                    System.out.println("Enter the student details:");
                    System.out.print("Enter the name: ");
                    String name=sc.nextLine().trim();
                    System.out.print("Enter the RollNo: ");
                    int rollNo=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the Department: ");
                    String depart=sc.nextLine().trim();
                    studentsList.add(new College(name,rollNo,depart));
                    System.out.println("  -------------------------");
                    System.out.println("| Student added successfully |");
                    System.out.println("  -------------------------");
                    break;
                }
                case 2:{
                    if(studentsList.isEmpty()){
                        System.out.println("--) Student list is Empty (--\n");
                    }else{
                        System.out.printf("\n\n    ***Students List***\n");
                        System.out.println(String.format("%s\t %s\t %s","Name","RollNo","Department"));
                        System.out.println(String.format("%s\t %s\t %s","----","------","--------"));
                        
                        for(College stud:studentsList){
                            System.out.println(stud);
                        }
                    }
                    System.out.println("   *---*---*   \n");
                break;
                }
                case 3:{
                    if(studentsList.isEmpty()){
                        System.out.println("-+ Student list is Empty +-");
                    }else{
                        System.out.printf("Enter the student name to search: ");
                        String name=sc.nextLine().trim();
                        List<College> filteredList=new ArrayList<>();
                        boolean isAvail=false;
                        for(int i=0;i<studentsList.size();i++){
                            if(studentsList.get(i).getName().toLowerCase().trim().equals(name)){
                                filteredList.add(studentsList.get(i));
                                isAvail=true;
                            }
                        }
                       if(isAvail){ 
                        System.out.printf("\n\n***Required Students List are***\n");
                        System.out.println(String.format("%s\t %s\t %s","Name","RollNo","Department"));
                        System.out.println(String.format("%s\t %s\t %s","----","------","--------"));
                        
                        for(College stud:filteredList){
                            System.out.println(stud);
                        }
                        }else{
                            System.out.println("-*- Student not present in the list -*-");
                            
                        }

                    }

                    System.out.println("\n   *---*---*   \n");
                    break;
                }
                case 4:{
                     System.exit(0);   
                     break;
                }
                default:{
                    System.out.println("---Choose correct choice---");
                } 
                }
            }
        }
    }
