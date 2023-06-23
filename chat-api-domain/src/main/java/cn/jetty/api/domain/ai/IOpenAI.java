package cn.jetty.api.domain.ai;

import java.io.IOException;

/**
 * @Author:滚~韬
 * @Date: 2023/6/23  23:41
 */
public interface IOpenAI {

    String doChatGPT(String openAiKey, String question) throws IOException;

}