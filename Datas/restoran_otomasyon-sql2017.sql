USE [master]
GO
/****** Object:  Database [gorsel3]    Script Date: 6/10/2021 7:48:27 PM ******/
CREATE DATABASE [gorsel3]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'gorsel3', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\gorsel3.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'gorsel3_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\gorsel3_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
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
EXEC sys.sp_db_vardecimal_storage_format N'gorsel3', N'ON'
GO
ALTER DATABASE [gorsel3] SET QUERY_STORE = OFF
GO
USE [gorsel3]
GO
/****** Object:  Table [dbo].[adminler]    Script Date: 6/10/2021 7:48:27 PM ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[baglanti_tablosu]    Script Date: 6/10/2021 7:48:27 PM ******/
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
/****** Object:  Table [dbo].[masa]    Script Date: 6/10/2021 7:48:27 PM ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[rezervasyon]    Script Date: 6/10/2021 7:48:27 PM ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[siparisler]    Script Date: 6/10/2021 7:48:27 PM ******/
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
/****** Object:  Table [dbo].[urunler]    Script Date: 6/10/2021 7:48:27 PM ******/
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
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
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
/****** Object:  Index [IX_siparisler]    Script Date: 6/10/2021 7:48:27 PM ******/
CREATE NONCLUSTERED INDEX [IX_siparisler] ON [dbo].[siparisler]
(
	[Toplam_fiyat] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
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
