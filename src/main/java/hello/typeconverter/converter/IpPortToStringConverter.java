package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

@Slf4j
public class IpPortToStringConverter implements Converter<IpPort, String> {

    /**
     *
     * @param source IpPort
     * @return String "127.0.0.1:8080"
     */
    @Override
    public String convert(IpPort source) {
        log.info("converter source={}", source);
        return source.getIp() + ":" + source.getPort();
    }

}
