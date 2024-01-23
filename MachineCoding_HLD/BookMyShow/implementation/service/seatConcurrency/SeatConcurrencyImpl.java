package MachineCoding_HLD.BookMyShow.implementation.service.seatConcurrency;

import MachineCoding_HLD.BookMyShow.implementation.util.Utils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class SeatConcurrencyImpl implements SeatConcurrency{
    Map<String,Integer> mock_redis = new ConcurrentHashMap<>(); /* Hashmap will give wrong answer here */

    @Override
    public Boolean lock(int seatNo, int showSlot) {
        String redisKey = Utils.joinKey(seatNo,showSlot);
        AtomicReference<Boolean> isLock = new AtomicReference<>(false);
            mock_redis.computeIfAbsent(redisKey, (key)->{
                isLock.set(true);
                return 1;
            });
            return isLock.get();
        }

    @Override
    public Boolean unLock(int seatNo, int showSlot) {
        String redisKey = Utils.joinKey(seatNo,showSlot);
        if(mock_redis.containsKey(redisKey)){
            mock_redis.remove(redisKey);
            return true;
        }
        return false;
    }


}
