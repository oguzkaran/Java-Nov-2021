/*----------------------------------------------------------------------------------------------------------------------
	Sınıflararası ilişkiler
	Nesne yönelimli programlama tekniği kullanılarak geliştirilecek bir projenin "kodlama" aşamasına gelindiğinde önce
	sınıflar ve aralarındaki ilişkiler belirlenir. Sonra kodlamaya geçilir.

	Sınıflararası ilişkiler aslında nesneler arasındaki ilişkiler olarak belirlenir. Örneğin uçak ile pilotu arasında
	bir ilişki vardır. Ya da insan ile kimlik kartı arasında da bir ilişki vardır. Bu ilişkiler aslında nesneler
	arasındadır. Ancak nesnelerin bu ilişkileri olacak şekilde yaratılabilmesi ve kullanılabilmesi için sınıfların uygun
	bir biçimde yazılması gerekir.

	Sınıflar ve ilişkiler belirlenirken bunların konuya ilişkin durumları (domain) düşünülür.

	Anahtar Notlar: Bir domain'de bir varlığın programlamada bir sınıfa karşılık getirilmesine genel olarak "tranformation"
	denir.

	Anahtar Notlar: Bir projenin ihtiyaçlarının belirlenmesinden (requirement analysis) teslime (deployment) kadar
	geçen sürecin çeşitli şemalarla anlatılmasını sağlayan UML (Unified Modeling Language) denilen bir araç bazı
	durumlarda kullanılabilmektedir. Bu aracın önemli ve geliştiricileri genel olarak ilgilendiren şemalarından birisi
	"sınıf şeması (class diagram)"'dır. Bu kodlamaya yönelik bir şemadır. Bu şemada sınıfların detayları ve ilişkiler çizilir.
	UML her zaman ve her detayı ile kulanılmalı mıdıd? Bu konuda verilecek cevap nettir: Hayır. Gerektiğinde ve gerektiği
	kadar kullanılmalıdır.

	Anahtar Notlar: Kavram ya da kavramlar modellerinken genel durumlar düşünülür. İstisna niteliğindeki durumlar modelleme
	yapılırken genel olarak göz önünde bulundurulmaz. Aksi durumda hiçbir şey modellenemez. Örneğin araba ile motoru
	arasındaki ilişki için şu durumlar belirleyici olsun:
		1. Araba nesnesine ait olan motor nesnesi başka bir araba nesnesi veya başka bir nesne tarafından kullanılamaz
		2. Araba nesnesine ait motor nesnesinin ömrü hemen hemen araba ile başlayıp, araba ile son bulsun
	Burada örneğin ikinci madde bazı durumlarda gerçekleşmeyebilir. Ama bu ilişkin genel durumunu bozmaz.

	Bir sınıfın derlenebilmesi için başka bir sınıfın var olması gerektiği duruma "bağımlılık (dependency)" denir.

	İki sınıf arasında aşağıdaki ilişkilerden ya hiçbirisi yoktur ya da bir tanesi vardır:
	1. İçerme (copmposition):
	2. Birleşme (aggregation):
	3. Çağrışım (association):
	4. Türetme/Kalıtım (inheritance):

	Anahtar Notlar:
	 
	Anahtar Notlar:
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{

	}
}

class Sample {

}

class Mample {
	public static void foo(Sample s)
	{

	}
}

