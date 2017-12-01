package com.felania.monstersuperleaguedatabook.utils;

/**
 * Created by Krsnik on 8/8/2017.
 */

import android.os.Parcelable;

        import android.os.Parcel;

public class CheckState implements Parcelable {

    private int position;
    private String value;
    private boolean check;



    public CheckState(int position, String value, boolean check) {

        this.position = position;
        this.value = value;
        this.check = check;
    }

    public CheckState(Parcel source) {
        position = source.readInt();
        value = source.readString();
        check = source.readByte() != 0;     //myBoolean == true if byte != 0

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(position);
        parcel.writeString(value);
        parcel.writeByte((byte) (check ? 1 : 0));
    }

    public String getValue() {
        return value;
    }

    public int getPosition() {
        return position;
    }

    public boolean getCheck() {
        return check;
    }


    public static final Creator<CheckState> CREATOR = new Creator<CheckState>() {
        @Override
        public CheckState[] newArray(int size) {
            return new CheckState[size];
        }

        @Override
        public CheckState createFromParcel(Parcel source) {
            return new CheckState(source);
        }
    };

}
