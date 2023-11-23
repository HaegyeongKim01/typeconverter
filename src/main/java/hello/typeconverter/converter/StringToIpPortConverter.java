package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

import static java.lang.Integer.parseInt;

@Slf4j
public class StringToIpPortConverter implements Converter<String, IpPort> {

    /**
     *
     * @param source String "127.0.0.1:8080"
     * @return IpPort
     */
    @Override
    public IpPort convert(String source) {
        log.info("converter source={}", source);
        String[] split = source.split(":");  //ip+port
        IpPort ipPort = new IpPort(split[0], parseInt(split[1]));
        return ipPort;
    }
}
