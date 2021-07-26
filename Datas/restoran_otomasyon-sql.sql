USE [master]
GO
/****** Object:  Database [gorsel3]    Script Date: 7/26/2021 4:29:11 AM ******/
CREATE DATABASE [gorsel3]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'gorsel3', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\gorsel3.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'gorsel3_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\gorsel3_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [gorsel3] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [gorsel3].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [gorsel3] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [gorsel3] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [gorsel3] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [gorsel3] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [gorsel3] SET ARITHABORT OFF 
GO
ALTER DATABASE [gorsel3] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [gorsel3] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [gorsel3] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [gorsel3] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [gorsel3] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [gorsel3] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [gorsel3] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [gorsel3] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [gorsel3] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [gorsel3] SET  DISABLE_BROKER 
GO
ALTER DATABASE [gorsel3] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [gorsel3] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [gorsel3] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [gorsel3] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [gorsel3] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [gorsel3] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [gorsel3] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [gorsel3] SET RECOVERY FULL 
GO
ALTER DATABASE [gorsel3] SET  MULTI_USER 
GO
ALTER DATABASE [gorsel3] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [gorsel3] SET DB_CHAINING OFF 
GO
ALTER DATABASE [gorsel3] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [gorsel3] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [gorsel3] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [gorsel3] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'gorsel3', N'ON'
GO
ALTER DATABASE [gorsel3] SET QUERY_STORE = OFF
GO
USE [gorsel3]
GO
/****** Object:  Table [dbo].[adisyon]    Script Date: 7/26/2021 4:29:11 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[adisyon](
	[masa] [nchar](10) NULL,
	[urun_id] [nchar](20) NULL,
	[urun_fiyati] [text] NULL,
	[Tarih] [text] NULL,
	[urun_adi] [text] NULL,
	[toplam] [text] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[adminler]    Script Date: 7/26/2021 4:29:11 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[adminler](
	[admin_kullanici_adi] [nchar](10) NOT NULL,
	[admin_sifre] [nchar](10) NULL,
 CONSTRAINT [PK_adminler] PRIMARY KEY CLUSTERED 
(
	[admin_kullanici_adi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[baglanti_tablosu]    Script Date: 7/26/2021 4:29:11 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[baglanti_tablosu](
	[urun_id] [nchar](10) NOT NULL,
	[masa] [nchar](10) NULL,
	[admin_kullanici_adi] [nchar](10) NULL,
	[siparis_ID] [nchar](10) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[masa]    Script Date: 7/26/2021 4:29:11 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[masa](
	[Masa] [nchar](10) NOT NULL,
	[admin_kullanici_adi] [nchar](10) NULL,
	[rezervasyon_masa] [nchar](10) NULL,
 CONSTRAINT [PK_masa] PRIMARY KEY CLUSTERED 
(
	[Masa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[rezervasyon]    Script Date: 7/26/2021 4:29:11 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[rezervasyon](
	[adSoyad] [nchar](10) NOT NULL,
	[Tarih] [date] NOT NULL,
	[Masa] [nchar](10) NOT NULL,
 CONSTRAINT [PK_rezervasyon] PRIMARY KEY CLUSTERED 
(
	[adSoyad] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[siparisler]    Script Date: 7/26/2021 4:29:11 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[siparisler](
	[siparis_ID] [text] NOT NULL,
	[Toplam_fiyat] [int] NULL,
	[Masa] [nchar](10) NULL,
	[Tarih] [date] NOT NULL,
	[urun_id] [nchar](10) NULL,
	[adSoyad] [nchar](10) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[urunler]    Script Date: 7/26/2021 4:29:11 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[urunler](
	[urun_id] [nchar](10) NOT NULL,
	[urun_adi] [nchar](20) NULL,
	[urun_fiyati] [int] NULL,
 CONSTRAINT [PK_urunler] PRIMARY KEY CLUSTERED 
(
	[urun_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[adisyon] ([masa], [urun_id], [urun_fiyati], [Tarih], [urun_adi], [toplam]) VALUES (N'Masa 2    ', N'icecek4             ', N'2', N'2021-07-26', N'Salgam              ', N'0')
INSERT [dbo].[adisyon] ([masa], [urun_id], [urun_fiyati], [Tarih], [urun_adi], [toplam]) VALUES (N'Masa 2    ', N'menü4               ', N'16', N'2021-07-26', N'Kusbasili Pide      ', N'0')
INSERT [dbo].[adisyon] ([masa], [urun_id], [urun_fiyati], [Tarih], [urun_adi], [toplam]) VALUES (N'Masa 2    ', N'menü6               ', N'24', N'2021-07-26', N'Urfa Kebap          ', N'0')
INSERT [dbo].[adisyon] ([masa], [urun_id], [urun_fiyati], [Tarih], [urun_adi], [toplam]) VALUES (N'Masa 2    ', N'tatli1              ', N'12', N'2021-07-26', N'Baklava(4 Adet)     ', N'0')
INSERT [dbo].[adisyon] ([masa], [urun_id], [urun_fiyati], [Tarih], [urun_adi], [toplam]) VALUES (N'Masa 2    ', N'tatli3              ', N'8', N'2021-07-26', N'Tulumba             ', N'0')
INSERT [dbo].[adisyon] ([masa], [urun_id], [urun_fiyati], [Tarih], [urun_adi], [toplam]) VALUES (N'Masa 2    ', N'menü3               ', N'14', N'2021-07-26', N'Kasarli Pide        ', N'0')
INSERT [dbo].[adisyon] ([masa], [urun_id], [urun_fiyati], [Tarih], [urun_adi], [toplam]) VALUES (N'Masa 4    ', N'icecek1             ', N'2', N'2021-07-26', N'Ayran               ', N'0')
INSERT [dbo].[adisyon] ([masa], [urun_id], [urun_fiyati], [Tarih], [urun_adi], [toplam]) VALUES (N'Masa 4    ', N'asdd                ', N'12', N'2021-07-26', N'asdf                ', N'0')
INSERT [dbo].[adisyon] ([masa], [urun_id], [urun_fiyati], [Tarih], [urun_adi], [toplam]) VALUES (N'Masa 2    ', N'icecek2             ', N'6', N'2021-07-26', N'Kola 1.lt           ', N'0')
INSERT [dbo].[adisyon] ([masa], [urun_id], [urun_fiyati], [Tarih], [urun_adi], [toplam]) VALUES (N'Masa 2    ', N'menü5               ', N'25', N'2021-07-26', N'Adana Kebap         ', N'0')
INSERT [dbo].[adisyon] ([masa], [urun_id], [urun_fiyati], [Tarih], [urun_adi], [toplam]) VALUES (N'Masa 2    ', N'menü7               ', N'30', N'2021-07-26', N'Beyti Kebap         ', N'0')
INSERT [dbo].[adisyon] ([masa], [urun_id], [urun_fiyati], [Tarih], [urun_adi], [toplam]) VALUES (N'Masa 2    ', N'tatli2              ', N'10', N'2021-07-26', N'Künefe              ', N'0')
GO
INSERT [dbo].[adminler] ([admin_kullanici_adi], [admin_sifre]) VALUES (N'admin     ', N'admin     ')
INSERT [dbo].[adminler] ([admin_kullanici_adi], [admin_sifre]) VALUES (N'Arif      ', N'123       ')
INSERT [dbo].[adminler] ([admin_kullanici_adi], [admin_sifre]) VALUES (N'Harun     ', N'123       ')
INSERT [dbo].[adminler] ([admin_kullanici_adi], [admin_sifre]) VALUES (N'Samet     ', N'123       ')
INSERT [dbo].[adminler] ([admin_kullanici_adi], [admin_sifre]) VALUES (N'Yasin     ', N'123       ')
GO
INSERT [dbo].[masa] ([Masa], [admin_kullanici_adi], [rezervasyon_masa]) VALUES (N'Masa 1    ', NULL, NULL)
INSERT [dbo].[masa] ([Masa], [admin_kullanici_adi], [rezervasyon_masa]) VALUES (N'Masa 2    ', NULL, NULL)
INSERT [dbo].[masa] ([Masa], [admin_kullanici_adi], [rezervasyon_masa]) VALUES (N'Masa 3    ', NULL, NULL)
INSERT [dbo].[masa] ([Masa], [admin_kullanici_adi], [rezervasyon_masa]) VALUES (N'Masa 4    ', NULL, NULL)
INSERT [dbo].[masa] ([Masa], [admin_kullanici_adi], [rezervasyon_masa]) VALUES (N'Masa 5    ', NULL, NULL)
INSERT [dbo].[masa] ([Masa], [admin_kullanici_adi], [rezervasyon_masa]) VALUES (N'Masa 6    ', NULL, NULL)
GO
INSERT [dbo].[rezervasyon] ([adSoyad], [Tarih], [Masa]) VALUES (N'asd       ', CAST(N'2021-01-01' AS Date), N'Masa 4    ')
INSERT [dbo].[rezervasyon] ([adSoyad], [Tarih], [Masa]) VALUES (N'asf       ', CAST(N'2021-01-01' AS Date), N'Masa 4    ')
INSERT [dbo].[rezervasyon] ([adSoyad], [Tarih], [Masa]) VALUES (N'sdg       ', CAST(N'2021-04-01' AS Date), N'Masa 4    ')
GO
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'08fc3bdd-ed02-4faf-8c2b-b9137ae21b39', 249, N'Masa 4    ', CAST(N'2021-06-08' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'a83591b1-8f91-4bbb-aca7-55875eb099eb', 249, N'Masa 4    ', CAST(N'2021-06-08' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'd829a0df-c957-4fc7-b675-3451565286ee', 10, N'Masa 2    ', CAST(N'2021-06-10' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'94ad21cb-8904-4251-9510-ac0fd271f757', 17, N'Masa 3    ', CAST(N'2021-07-25' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'e8d71eb7-a78e-4f92-ba71-d63861ad5e61', 19, N'Masa 1    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'3dad2b7d-d9a7-477b-a80e-647d2b01fe0a', 8, N'Masa 1    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'd4d72dd2-cfde-40b8-830c-04926e41620b', 5, N'Masa 1    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'26c05690-3f5c-437e-b3ad-695490f91b7d', 3, N'Masa 4    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'78832aea-b605-47a0-8538-22b374c35d3d', 211, N'Masa 5    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'20ae24af-f1bc-43b0-aafe-06519bb0d10d', 29, N'Masa 1    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'0dded548-3bd7-4169-b20e-d479574cce2a', 0, N'Masa 1    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'd3140171-3da1-4ff1-90ac-dddf3f248e4e', 0, N'Masa 3    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'd8443966-9a74-4e31-919d-67e513e550b3', 16, N'Masa 6    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'fa55111a-eca9-4403-a1ec-df3129bf30c7', 146, N'Masa 1    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'856a0108-a925-4824-938f-de344b41cd65', 197, N'Masa 3    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'93bb1c9f-c0e4-4e05-8d9e-bf565142c2f8', 211, N'Masa 6    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'fc41280b-8b19-4129-b516-4c95911cc404', 29, N'Masa 3    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'654cd562-2f4b-45b6-9e9a-910a3965249e', 0, N'Masa 2    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'5fc8ba21-4f38-45db-abf4-c08357e8c8d3', 0, N'Masa 4    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'4e668a4a-9e69-4a03-a5b7-06adac8e88c1', 11, N'Masa 5    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id], [adSoyad]) VALUES (N'2c66be93-0e39-4ba5-99f2-92842aaf4b61', 18, N'Masa 1    ', CAST(N'2021-07-26' AS Date), NULL, NULL)
GO
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'asdd      ', N'asdf                ', 12)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'icecek1   ', N'Ayran               ', 2)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'icecek2   ', N'Kola 1.lt           ', 6)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'icecek3   ', N'Kutu Kola           ', 3)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'icecek4   ', N'Şalgam              ', 2)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'menü1     ', N'Lahmacun            ', 8)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'menü2     ', N'Kıymalı Pide        ', 15)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'menü3     ', N'Kaşarlı Pide        ', 14)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'menü4     ', N'Kuşbaşılı Pide      ', 16)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'menü5     ', N'Adana Kebap         ', 25)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'menü6     ', N'Urfa Kebap          ', 24)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'menü7     ', N'Beyti Kebap         ', 30)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'tatlı1    ', N'Baklava(4 Adet)     ', 12)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'tatlı2    ', N'Künefe              ', 10)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'tatlı3    ', N'Tulumba             ', 8)
GO
/****** Object:  Index [IX_siparisler]    Script Date: 7/26/2021 4:29:11 AM ******/
CREATE NONCLUSTERED INDEX [IX_siparisler] ON [dbo].[siparisler]
(
	[Toplam_fiyat] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[baglanti_tablosu]  WITH CHECK ADD  CONSTRAINT [FK_baglanti_tablosu_adminler] FOREIGN KEY([admin_kullanici_adi])
REFERENCES [dbo].[adminler] ([admin_kullanici_adi])
GO
ALTER TABLE [dbo].[baglanti_tablosu] CHECK CONSTRAINT [FK_baglanti_tablosu_adminler]
GO
ALTER TABLE [dbo].[baglanti_tablosu]  WITH CHECK ADD  CONSTRAINT [FK_baglanti_tablosu_masa] FOREIGN KEY([masa])
REFERENCES [dbo].[masa] ([Masa])
GO
ALTER TABLE [dbo].[baglanti_tablosu] CHECK CONSTRAINT [FK_baglanti_tablosu_masa]
GO
ALTER TABLE [dbo].[baglanti_tablosu]  WITH CHECK ADD  CONSTRAINT [FK_baglanti_tablosu_urunler] FOREIGN KEY([urun_id])
REFERENCES [dbo].[urunler] ([urun_id])
GO
ALTER TABLE [dbo].[baglanti_tablosu] CHECK CONSTRAINT [FK_baglanti_tablosu_urunler]
GO
ALTER TABLE [dbo].[masa]  WITH CHECK ADD  CONSTRAINT [FK_masa_adminler] FOREIGN KEY([admin_kullanici_adi])
REFERENCES [dbo].[adminler] ([admin_kullanici_adi])
GO
ALTER TABLE [dbo].[masa] CHECK CONSTRAINT [FK_masa_adminler]
GO
ALTER TABLE [dbo].[siparisler]  WITH CHECK ADD  CONSTRAINT [FK_siparisler_masa] FOREIGN KEY([Masa])
REFERENCES [dbo].[masa] ([Masa])
GO
ALTER TABLE [dbo].[siparisler] CHECK CONSTRAINT [FK_siparisler_masa]
GO
ALTER TABLE [dbo].[siparisler]  WITH CHECK ADD  CONSTRAINT [FK_siparisler_rezervasyon] FOREIGN KEY([adSoyad])
REFERENCES [dbo].[rezervasyon] ([adSoyad])
GO
ALTER TABLE [dbo].[siparisler] CHECK CONSTRAINT [FK_siparisler_rezervasyon]
GO
ALTER TABLE [dbo].[siparisler]  WITH CHECK ADD  CONSTRAINT [FK_siparisler_urunler] FOREIGN KEY([urun_id])
REFERENCES [dbo].[urunler] ([urun_id])
GO
ALTER TABLE [dbo].[siparisler] CHECK CONSTRAINT [FK_siparisler_urunler]
GO
USE [master]
GO
ALTER DATABASE [gorsel3] SET  READ_WRITE 
GO
