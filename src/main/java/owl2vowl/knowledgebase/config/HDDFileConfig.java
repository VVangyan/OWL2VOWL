package owl2vowl.knowledgebase.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 读取本地硬盘图片配置
 * 
 * @author yan
 */
@Configuration
public class HDDFileConfig extends WebMvcConfigurerAdapter {

	@Value("${upload-path}")
	private String uploadPath;

	@Value("${officeToPdf.dir}")
	private String officeToPdfPath;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/localFile/**").addResourceLocations("file:" + uploadPath, "file:" + officeToPdfPath);

		super.addResourceHandlers(registry);
	}

}
