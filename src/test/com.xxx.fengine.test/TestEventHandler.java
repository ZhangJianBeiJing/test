import java.util.Date;

import com.xxxx.fengine.eventUtils.Event;
import com.xxxx.fengine.eventUtils.IEventHandler;

public class TestEventHandler implements IEventHandler {

    /**
     * @author ligh4 2015年3月16日下午6:00:48
     */
    @Override
    public Object onEvent(Event event) {

        System.out.println("On event  " + event.getId() + " Type:" + event.getType());
        return new Date();
    }

}
