package com.cc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.PropertyUtil;

import java.io.*;

/**
 * Title: MailClass
 * Description: MailClass
 * Company: <a href=www.cc.com>cc</a>
 * Date:  2017/2/28
 *
 * @author <a href=mailto:daydayupzzc@163.com>chaochao</a>
 */
public class MailClass {

    private static Logger logger = LoggerFactory.getLogger(MailClass.class);

    private static String filePath = PropertyUtil.getProperties("filePath");//文件路径

    public static void main(String[] args) {
        try {
            for (int i = 1; i < 1000; i++) {
                logger.info("第 " + i + " 次读文件 " + filePath);
                readFile(filePath);
                Thread.sleep(1000 * 5);//休息5秒钟
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName){
        BufferedReader bufferedReader = null;
        try{
            File file = new File(fileName);

            if (file.isFile() && file.exists()) {
                bufferedReader = new BufferedReader(new FileReader(file));
                String line = null;
                int lineNum = 1;
                // 一次读入一行，直到读入null为文件结束
                while ((line = bufferedReader.readLine()) != null) {
                    logger.info("line " + lineNum + ": " + line);
                    lineNum++;
                }
            } else {
                logger.error("文件不存在");
            }
        }catch(Exception e){
            logger.error(e.getMessage(),e);
        }finally {
            try{
                if (bufferedReader != null){
                    bufferedReader.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
