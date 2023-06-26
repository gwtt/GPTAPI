package cn.jetty.api;

import cn.Jetty.api.PropertyUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Map;

/**
 * @Author:滚~韬
 * @Date: 2023/6/20  17:46
 */

public class ApiTest {
    @Test
    public void query_unanswered_questions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/28885422524121/topics?scope=all&count=20");

        get.addHeader("cookie", "\n" +
                "zsxq_access_token=2E71F15E-69D2-617E-7003-EC27A5AAD07F_FFB8DC9E37B400D9; zsxqsessionid=5ef37e82f796efadd411769182821b00; abtest_env=product; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22212544421142541%22%2C%22first_id%22%3A%22188d3bd2da9b74-0250a0b18cad55e-7e56547a-2073600-188d3bd2daafd6%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTg4ZDNiZDJkYTliNzQtMDI1MGEwYjE4Y2FkNTVlLTdlNTY1NDdhLTIwNzM2MDAtMTg4ZDNiZDJkYWFmZDYiLCIkaWRlbnRpdHlfbG9naW5faWQiOiIyMTI1NDQ0MjExNDI1NDEifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22212544421142541%22%7D%2C%22%24device_id%22%3A%22188d3bd2da9b74-0250a0b18cad55e-7e56547a-2073600-188d3bd2daafd6%22%7D");
        get.addHeader("Content-Type", "application/json;charset=utf8");

        CloseableHttpResponse response = httpClient.execute(get);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }
    @Test
    public void answer() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("https://yiyan.baidu.com/eb/chat/query");
        post.addHeader("cookie", "\n" +
                "BAIDUID=AE755ED0DB84E83C416FD89411FB1B38:FG=1; BDUSS=35URUFZSzMtQWp6aUdZa0U3S0s1VFpmNE1vTDZJajB4MzNjWEk4d2pzckhnbTFrSVFBQUFBJCQAAAAAAQAAAAEAAACfJpAKybHCvrb4uenWrrjoAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMf1RWTH9UVkT; BDUSS_BFESS=35URUFZSzMtQWp6aUdZa0U3S0s1VFpmNE1vTDZJajB4MzNjWEk4d2pzckhnbTFrSVFBQUFBJCQAAAAAAQAAAAEAAACfJpAKybHCvrb4uenWrrjoAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMf1RWTH9UVkT; BIDUPSID=AE755ED0DB84E83C416FD89411FB1B38; PSTM=1683608012; BAIDUID_BFESS=AE755ED0DB84E83C416FD89411FB1B38:FG=1; ZFY=5snUkaAHUMuZ20fzIgp:BI:BSswrY8OgEmhWa2ca0VYTU:C; XFI=ebd01ba0-104b-11ee-8dc3-a5a8d501229d; XFCS=7EEAE298879606B436414112D99752D26F22D94D4EA4B82B00B658C19B8C76F9; XFT=OHueF1lG4RDiE5HfzikW1eYEQ/TDpE9+HZqxTX3IPvA=; RT=\"z=1&dm=baidu.com&si=dad97bde-626c-497c-b086-c77a6c303b88&ss=lj5vr7be&sl=6&tt=dkj&bcn=https%3A%2F%2Ffclog.baidu.com%2Flog%2Fweirwood%3Ftype%3Dperf&ld=jfk5\"; ab_sr=1.0.1_NmEwM2ZjNDc3ODhhY2FiMjBiNmM2NzE5M2VmNWZkMWEzZmJkOTI1NmRiZDI5ODZkOWY2NDUzZTQwMmQ2MDVkZTIyN2RmZTdkNDlhMTYxNjExZGJiNTM4MzM3MTIwMzU1NjgzNTY2NWY5Y2M1MmQzNzY3NzE3OWVhODczYmE5M2UxMTFlODQwYzlmNTk0MmNjYmI5MjM1MTUxMDA2ZGYyYjIwNDZlZmYzMTlmZDg5OGY4ZTU0ZTJmOTk5NDg5N2M0");
        post.addHeader("Content-Type", "application/json;charset=utf8");

        String paramJson = "{\n" +
                "  \"chatId\": \"146399563\",\n" +
                "  \"parentChatId\": \"146399562\",\n" +
                "  \"sentenceId\": 0,\n" +
                "  \"sessionId\": \"16556022\",\n" +
                "  \"stop\": 0,\n" +
                "  \"timestamp\": 1687362896969,\n" +
                "  \"deviceType\": \"pc\",\n" +
                "  \"sign\": \"1687309210783_1687362896963_qdtqOp91tRS6dvHtxHP6daSW2TYN30I4kjIO0KznkN5tlWB9JhZboq6P9UKeKNfaPGfe7+4QmdGit7ioyZiLkCunxcOIv5sxzDMD52zpUvYjyahHG5hweDdr3CyFJcAwRmhki15ejjyh/9/fq1x2WOTxHBxoX3/bX/sfdPrzKmPYpZh/e+F33c/u0+b5l0bigrEparxkw5tJ0sR1TMvFa0XHK+x9E/LhqAJfClVX5N6LRA8e2KlmO0782gndUFMKcp82syeVUq+bkxnquEhlUJXaoXynl0bArDbd2wrMTPLmEypPtoeyUIReUrGaJeBdzIEQ3lny/Mb6YaHSnXZ8Z3F/9/ybWL0+teSoOFUzKpCW5YUaM21aP2nqt3RI3Mm0CpaEjRJYyoZxjZyZqxvFoIKnOFemJnm0gDm0WYzDHdrBpO6r8CQNwHGNIZ3U9SEIIyVYT7kT126LtBeCV+QQioDkcVeDB5RFYa8VeR4MldMVsg5oUTaFJ9QPstyNG6JC\"\n" +
                "}";

        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }
    @Test
    public void test_chatGPT() throws IOException {
        CloseableHttpClient build = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost("https://api.openai.com/v1/chat/completions");
        httpPost.addHeader("Content-Type","application/json");
        httpPost.addHeader("Authorization","Bear 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");
        String paramJson = "{\n" +
                "     \"model\": \"gpt-3.5-turbo\",\n" +
                "     \"messages\": [{\"role\": \"user\", \"content\": \"你好哦\"}],\n" +
                "     \"temperature\": 0.7\n" +
                "   }";
        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        httpPost.setEntity(stringEntity);

        CloseableHttpResponse response = build.execute(httpPost);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }


}
