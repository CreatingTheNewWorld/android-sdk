package ai.evolv.android_sdk;



import java.util.HashSet;
import java.util.Set;

import ai.evolv.android_sdk.evolvinterface.EvolvAction;
import ai.evolv.android_sdk.evolvinterface.EvolvAllocationStore;


class Execution<T> {

    private final String key;
    private final T defaultValue;
    private final EvolvAction function;
    private final EvolvParticipant participant;
    private final EvolvAllocationStore store;

    private Set<String> alreadyExecuted = new HashSet<>();

    Execution(String key, T defaultValue, EvolvAction<T> function, EvolvParticipant participant,
              EvolvAllocationStore store) {
        this.key = key;
        this.defaultValue = defaultValue;
        this.function = function;
        this.participant = participant;
        this.store = store;
    }

    String getKey() {
        return key;
    }

    void executeWithDefault() {
        function.apply(defaultValue);
    }

}
