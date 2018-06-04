package ddms.api.converter;

/**
 * Created by Deb
 * Date : 04/06/2018.
 */
public interface ValueConverter<V> {

    V toValue();

    void fromValue(V value);
}
