USE [master]
GO
/****** Object:  Database [gorsel3]    Script Date: 6/8/2021 7:00:29 PM ******/
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
/****** Object:  Table [dbo].[adminler]    Script Date: 6/8/2021 7:00:29 PM ******/
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
/****** Object:  Table [dbo].[baglanti_tablosu]    Script Date: 6/8/2021 7:00:29 PM ******/
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
/****** Object:  Table [dbo].[masa]    Script Date: 6/8/2021 7:00:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[masa](
	[Masa] [nchar](10) NOT NULL,
	[admin_kullanici_adi] [nchar](10) NULL,
 CONSTRAINT [PK_masa] PRIMARY KEY CLUSTERED 
(
	[Masa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[siparisler]    Script Date: 6/8/2021 7:00:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[siparisler](
	[siparis_ID] [text] NOT NULL,
	[Toplam_fiyat] [int] NULL,
	[Masa] [nchar](10) NULL,
	[Tarih] [date] NOT NULL,
	[urun_id] [nchar](10) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[urunler]    Script Date: 6/8/2021 7:00:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[urunler](
	[urun_id] [nchar](10) NOT NULL,
	[urun_adi] [nchar](10) NULL,
	[urun_fiyati] [int] NULL,
 CONSTRAINT [PK_urunler] PRIMARY KEY CLUSTERED 
(
	[urun_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[adminler] ([admin_kullanici_adi], [admin_sifre]) VALUES (N'admin     ', N'admin     ')
GO
INSERT [dbo].[masa] ([Masa], [admin_kullanici_adi]) VALUES (N'Masa 4    ', NULL)
INSERT [dbo].[masa] ([Masa], [admin_kullanici_adi]) VALUES (N'Masa 5    ', NULL)
INSERT [dbo].[masa] ([Masa], [admin_kullanici_adi]) VALUES (N'Masa 6    ', NULL)
INSERT [dbo].[masa] ([Masa], [admin_kullanici_adi]) VALUES (N'masa1     ', NULL)
INSERT [dbo].[masa] ([Masa], [admin_kullanici_adi]) VALUES (N'masa2     ', NULL)
INSERT [dbo].[masa] ([Masa], [admin_kullanici_adi]) VALUES (N'masa3     ', NULL)
GO
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id]) VALUES (N'08fc3bdd-ed02-4faf-8c2b-b9137ae21b39', 249, N'Masa 4    ', CAST(N'2021-06-08' AS Date), NULL)
INSERT [dbo].[siparisler] ([siparis_ID], [Toplam_fiyat], [Masa], [Tarih], [urun_id]) VALUES (N'a83591b1-8f91-4bbb-aca7-55875eb099eb', 249, N'Masa 4    ', CAST(N'2021-06-08' AS Date), NULL)
GO
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'1         ', N'ürün 1    ', 124)
INSERT [dbo].[urunler] ([urun_id], [urun_adi], [urun_fiyati]) VALUES (N'2         ', N'ürün2     ', 125)
GO
/****** Object:  Index [IX_siparisler]    Script Date: 6/8/2021 7:00:30 PM ******/
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
ALTER TABLE [dbo].[siparisler]  WITH CHECK ADD  CONSTRAINT [FK_siparisler_urunler] FOREIGN KEY([urun_id])
REFERENCES [dbo].[urunler] ([urun_id])
GO
ALTER TABLE [dbo].[siparisler] CHECK CONSTRAINT [FK_siparisler_urunler]
GO
USE [master]
GO
ALTER DATABASE [gorsel3] SET  READ_WRITE 
GO
