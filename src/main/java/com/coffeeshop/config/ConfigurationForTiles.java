package com.coffeeshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * Created by Crawlers on 5/24/2017.
 */
@Configuration
public class ConfigurationForTiles {
    @Bean
    public TilesConfigurer tilesConfigurer() {
        System.out.println("inside tiles configuration");
        final TilesConfigurer configurer = new TilesConfigurer();
        configurer.setDefinitions(new String[] { "WEB-INF/tiles/tiles.xml" });
        configurer.setCheckRefresh(true);
        return configurer;
    }

    @Bean
    public TilesViewResolver tilesViewResolver() {
        final TilesViewResolver resolver = new TilesViewResolver();
        resolver.setViewClass(TilesView.class);
        return resolver;
    }
}
