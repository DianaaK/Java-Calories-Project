package java_contact_app;

public class Person {
    private static int idCounter = 0;
    protected String mLastname, mName, mSex, mEmail, mPassword;
    protected int id, mAge, mWeight, mHeight;
    protected boolean isAdmin;

    public Person() {
        mLastname="";
        mName="";
        mSex="";
        mEmail="";
        mPassword="";
        mAge=0;
        mWeight=0;
        mHeight=0;
        this.id = idCounter++;
    }



    public Person(String mSurname, String mName, String mSex, String mEmail, String mPassword, int mAge, int mWeight, int mHeight) {
        this.mLastname = mSurname;
        this.mName = mName;
        this.mSex = mSex;
        this.mEmail = mEmail;
        this.mPassword = mPassword;
        this.mAge = mAge;
        this.mWeight = mWeight;
        this.mHeight = mHeight;
        this.id = idCounter++;
    }

    public void setmLastname(String mLastname) {
        this.mLastname = mLastname;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmSex(String mSex) {
        this.mSex = mSex;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public void setmWeight(int mWeight) {
        this.mWeight = mWeight;
    }

    public void setmHeight(int mHeight) {
        this.mHeight = mHeight;
    }
    
     public String getmLastname() {
        return mLastname;
    }

    public String getmName() {
        return mName;
    }

    public String getmSex() {
        return mSex;
    }

    public String getmEmail() {
        return mEmail;
    }

    public String getmPassword() {
        return mPassword;
    }

    public int getmAge() {
        return mAge;
    }

    public int getmWeight() {
        return mWeight;
    }

    public int getmHeight() {
        return mHeight;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }
    
    
    @Override
    public String toString() {
        return "Person{" +
                "mSurname='" + mLastname + '\'' +
                ", mName='" + mName + '\'' +
                ", mSex='" + mSex + '\'' +
                ", mAge=" + mAge +
                ", mWeight=" + mWeight +
                ", mHeight=" + mHeight +
                '}';
    }
}
