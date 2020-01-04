package aldi.krobok.myrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

import java.sql.SQLOutput;

public class Hmj implements Parcelable {
    private String name;
    private String descrpition;
    private String photo;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getDescrpition(){
        return descrpition;
    }

    public void setDescrpition(String descrpition){
        this.descrpition=descrpition;
    }

    public String getPhoto(){
        return photo;
    }

    public void setPhoto(String photo){
        this.photo=photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.descrpition);
        dest.writeString(this.photo);
    }

    Hmj(){

    }

    private Hmj(Parcel in){
        this.name = in.readString();
        this.descrpition = in.readString();
        this.photo = in.readString();
    }

    public  static  final Parcelable.Creator<Hmj>CREATOR = new Parcelable.Creator<Hmj>(){

        @Override
        public Hmj createFromParcel(Parcel source) {
            return new Hmj(source);
        }

        @Override
        public Hmj[] newArray(int size) {
            return new Hmj[size];
        }
    };
}
