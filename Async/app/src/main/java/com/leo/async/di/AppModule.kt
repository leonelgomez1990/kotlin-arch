package com.leo.async.di

import com.leo.async.data.InformationRepository
import com.leo.async.framework.FakeDataSource
import com.leo.async.framework.InformationDataSource
import com.leo.async.ui.viewmodel.ListViewModel
import com.leo.async.usecases.GetInformation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideFakeDataSource () : InformationDataSource = FakeDataSource()

    @Provides
    fun provideInformationRepository(informationDataSource: InformationDataSource) : InformationRepository = InformationRepository(informationDataSource)

    @Provides
    fun provideGetInformation (informationRepository: InformationRepository) : GetInformation = GetInformation(informationRepository)

    @Provides
    fun provideListViewModel (getSomeInformation: GetInformation) : ListViewModel = ListViewModel(getSomeInformation)
}