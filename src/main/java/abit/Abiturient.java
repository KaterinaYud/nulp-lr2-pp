package abit;

public class Abiturient {
    private int id;
    private String first_name;
    private String last_name;
    private String patronymic;
    private String address;
    private String phone;
    private double average_point;

    public Abiturient(int id_ab, String first_name_ab, String last_name, String patronymic, String address, String phone, double average_point){
        id=id_ab;
        first_name=first_name_ab;
        this.last_name=last_name;
        this.patronymic=patronymic;
        this.address=address;
        this.phone=phone;
        this.average_point=average_point;
    }

    public void setId_ab(int id_ab){
        this.id=id_ab;
    }

    public int getId_ab(){
        return id;
    }

    public void setFirst_name(String first_name){
        this.first_name=first_name;
    }

    public String getFirst_name(){
        return first_name;
    }

    public void setLast_name(String last_name){
        this.last_name=last_name;
    }

    public String getLast_name(){
        return last_name;
    }

    public void setPatronymic(String patronymic){
        this.patronymic=patronymic;
    }

    public String getPatronymic(){
        return patronymic;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress(){
        return address;
    }


    public void setPhone(String phone){
        this.phone=phone;
    }

    public String getPhone(){
        return phone;
    }

    public void setAverage_point(double average_point){
        this.average_point=average_point;
    }

    public double getAverage_point(){
        return average_point;
    }

    public String toString() {
        return "Абітурієнт: " +
                "ID=" + id + ", ім'я='" + first_name + '\'' + ", прізвище='" + last_name + '\'' +
                ", по-батькові='" + patronymic + '\'' + ", адреса='" + address + '\'' +
                ", телефон='" + phone + '\'' + ", середній бал=" + average_point;
    }
}
