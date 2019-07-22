package jni.chowen.com.patternapplication.TemplateModel;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/9 21:49
 */
public class CoderA extends AbstractCoder{
    private Logger logger = Logger.getLogger("CoderA");
    @Override
    public void eat() {
        logger.info("坐着吃饭");
    }

    @Override
    public void work() {
        logger.info("走路上班");
    }

    @Override
    public void comeOffWork() {
        logger.info("10点下班");
    }

    @Override
    public void study() {
        logger.info("看技术类书籍");
    }

    @Override
    public void sleep() {
        logger.info("凌晨1点睡觉");
    }
}
