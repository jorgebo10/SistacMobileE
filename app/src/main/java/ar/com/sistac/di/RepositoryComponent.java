package ar.com.sistac.di;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component( modules = {RepositoryModule.class})
public interface RepositoryComponent {

}

