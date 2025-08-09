class College{
    private String name,depart;
    private Integer rollNo;
    public College(String name,Integer rollNo,String depart){
        this.name=name;
        this.rollNo=rollNo;
        this.depart=depart;
    }

    public String getName(){
        return name;
    }
    public String  getDepart(){
        return depart;
    }
    public Integer getRollNo(){
        return rollNo;
    }
    public String toString(){
        return String.format("%s\t %d\t %s",name,rollNo,depart);
    }
}