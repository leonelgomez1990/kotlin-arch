package com.leo.hilt.di

import com.leo.hilt.data.InformationRepository
import com.leo.hilt.framework.FakeDataSource
import com.leo.hilt.framework.InformationDataSource
import com.leo.hilt.ui.viewmodel.ListViewModel
import com.leo.hilt.usecases.GetInformation
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