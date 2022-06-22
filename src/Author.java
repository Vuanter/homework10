public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {

        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }


    @Override
    public boolean equals(Object object) {
        Author object1 = (Author) object;
        if (this == object) return true;
        else if (this.firstName == object1.getFirstName() && (this.secondName == object1.getSecondName()))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.firstName.hashCode();
    }

    @Override
    public String toString(){
        return "Имя автора: " + this.firstName + " Фамилия автора " + this.secondName;
    }

}
