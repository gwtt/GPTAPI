package cn.jetty.api.domain.zsxq.model.aggregates;

import cn.jetty.api.domain.zsxq.model.res.RespData;

/**
 * @Author:滚~韬
 * @Date: 2023/6/22  23:38
 */
public class UnAnsweredQuestionsAggregates {

    private boolean succeeded;
    private RespData resp_data;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public RespData getResp_data() {
        return resp_data;
    }

    public void setResp_data(RespData resp_data) {
        this.resp_data = resp_data;
    }

}