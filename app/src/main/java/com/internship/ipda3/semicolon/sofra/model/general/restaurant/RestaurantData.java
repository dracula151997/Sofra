
package com.internship.ipda3.semicolon.sofra.model.general.restaurant;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class RestaurantData {

    @SerializedName("current_page")
    private Long mCurrentPage;
    @SerializedName("data")
    private List<RestaurantDatum> mData;
    @SerializedName("from")
    private Long mFrom;
    @SerializedName("last_page")
    private Long mLastPage;
    @SerializedName("next_page_url")
    private Object mNextPageUrl;
    @SerializedName("per_page")
    private Long mPerPage;
    @SerializedName("prev_page_url")
    private Object mPrevPageUrl;
    @SerializedName("to")
    private Long mTo;
    @SerializedName("total")
    private Long mTotal;

    public Long getCurrentPage() {
        return mCurrentPage;
    }

    public void setCurrentPage(Long currentPage) {
        mCurrentPage = currentPage;
    }

    public List<RestaurantDatum> getData() {
        return mData;
    }

    public void setData(List<RestaurantDatum> data) {
        mData = data;
    }

    public Long getFrom() {
        return mFrom;
    }

    public void setFrom(Long from) {
        mFrom = from;
    }

    public Long getLastPage() {
        return mLastPage;
    }

    public void setLastPage(Long lastPage) {
        mLastPage = lastPage;
    }

    public Object getNextPageUrl() {
        return mNextPageUrl;
    }

    public void setNextPageUrl(Object nextPageUrl) {
        mNextPageUrl = nextPageUrl;
    }

    public Long getPerPage() {
        return mPerPage;
    }

    public void setPerPage(Long perPage) {
        mPerPage = perPage;
    }

    public Object getPrevPageUrl() {
        return mPrevPageUrl;
    }

    public void setPrevPageUrl(Object prevPageUrl) {
        mPrevPageUrl = prevPageUrl;
    }

    public Long getTo() {
        return mTo;
    }

    public void setTo(Long to) {
        mTo = to;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

}
