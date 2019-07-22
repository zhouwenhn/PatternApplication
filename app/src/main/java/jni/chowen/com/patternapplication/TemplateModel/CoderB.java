package jni.chowen.com.patternapplication.TemplateModel;

import java.util.logging.Logger;

/**
 * Created by zhouwen on 2019/7/9 21:50
 */
public class CoderB extends AbstractCoder{
    private Logger logger = Logger.getLogger("CoderB");
    @Override
    public void eat() {
        logger.info("躺着吃饭");
    }

    @Override
    public void work() {
        logger.info("坐车上班");
    }

    @Override
    public void comeOffWork() {
        logger.info("11点下班");
    }

    @Override
    public void study() {
        logger.info("看管理类书籍");
    }

    @Override
    public void sleep() {
        logger.info("凌晨2点睡觉");
    }
}
