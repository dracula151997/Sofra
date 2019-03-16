
package com.internship.ipda3.semicolon.sofra.model.restaurent.changeState;

import com.google.gson.annotations.SerializedName;
import com.internship.ipda3.semicolon.sofra.model.general.restaurant.RestaurantDatum;

@SuppressWarnings("unused")
public class ChangeState {

    @SerializedName("data")
    private RestaurantDatum mData;
    @SerializedName("msg")
    private String mMsg;
    @SerializedName("status")
    private Long mStatus;

    public RestaurantDatum getData() {
        return mData;
    }

    public void setData(RestaurantDatum data) {
        mData = data;
    }

    public String getMsg() {
        return mMsg;
    }

    public void setMsg(String msg) {
        mMsg = msg;
    }

    public Long getStatus() {
        return mStatus;
    }

    public void setStatus(Long status) {
        mStatus = status;
    }

}
