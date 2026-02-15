package youTube_Observer_Iterator;

import java.util.List;


public class ChannelSubscriberIterator implements SubscriberIterator {

    private List<Subscriber_observer> subscribers;
    private int position = 0;

    public ChannelSubscriberIterator(List<Subscriber_observer> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public boolean hasNext() {
        return position < subscribers.size();
    }

    @Override
    public Subscriber_observer next() {
            if(!hasNext()) {
                throw new RuntimeException("No more elements");
            }
            return subscribers.get(position++);
        }
}

