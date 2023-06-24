package cn.jetty.api.domain.zsxq.model.vo;

/**
 * @Author:滚~韬
 * @Date: 2023/6/22  23:25
 */
public class UserSpecific {

    private boolean liked;

    private boolean subscribed;

    public void setLiked(boolean liked){
        this.liked = liked;
    }
    public boolean getLiked(){
        return this.liked;
    }
    public void setSubscribed(boolean subscribed){
        this.subscribed = subscribed;
    }
    public boolean getSubscribed(){
        return this.subscribed;
    }

}