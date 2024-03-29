USE [technology]
GO
/****** Object:  Table [dbo].[ThirdX]    Script Date: 04/08/2018 16:05:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ThirdX](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](50) NULL,
	[parentId] [int] NULL,
 CONSTRAINT [PK_ThirdX] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ThirdH]    Script Date: 04/08/2018 16:05:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ThirdH](
	[id] [int] NOT NULL,
	[name] [varchar](50) NULL,
	[parentId] [int] NULL,
 CONSTRAINT [PK_ThirdH] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[T_DCWJXX]    Script Date: 04/08/2018 16:05:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[T_DCWJXX](
	[WJID] [varchar](200) NOT NULL,
	[username] [varchar](50) NOT NULL,
	[SZDY] [varchar](50) NOT NULL,
	[SFSH] [int] NULL,
	[V] [text] NULL,
	[JGMC] [varchar](200) NOT NULL,
	[GLBM] [varchar](50) NULL,
	[TXDZ] [varchar](100) NOT NULL,
	[DWWZ] [varchar](100) NULL,
	[DZYX] [varchar](100) NOT NULL,
	[FRDB] [varchar](50) NOT NULL,
	[YZBM] [varchar](10) NULL,
	[LXR] [varchar](50) NOT NULL,
	[GDDH] [varchar](20) NOT NULL,
	[YDDH] [varchar](20) NOT NULL,
	[CZ] [varchar](20) NULL,
	[JGSX] [varchar](50) NOT NULL,
	[JGJJ] [text] NOT NULL,
	[JSXQMC] [varchar](200) NOT NULL,
	[QSXQNF] [int] NOT NULL,
	[JZXQNF] [int] NOT NULL,
	[ZDKJXQGS] [text] NOT NULL,
	[GJZ] [varchar](200) NOT NULL,
	[YJLX] [varchar](50) NOT NULL,
	[XKFL1] [varchar](80) NULL,
	[XKFL2] [varchar](80) NULL,
	[XKFL3] [varchar](80) NULL,
	[XQJSSSLY] [varchar](50) NULL,
	[QTJSMS] [varchar](50) NULL,
	[XQJSYYHY1] [varchar](20) NULL,
	[XQJSYYHY2] [varchar](20) NULL,
	[XQJSYYHY3] [varchar](20) NULL,
	[JSXQHZMS] [varchar](50) NOT NULL,
	[HZYXDW] [varchar](50) NULL,
	[NTR] [varchar](50) NULL,
	[createDate] [datetime] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[SecondX]    Script Date: 04/08/2018 16:05:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SecondX](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](50) NULL,
	[parentId] [int] NULL,
 CONSTRAINT [PK_SecondX] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[SecondH]    Script Date: 04/08/2018 16:05:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SecondH](
	[id] [int] NOT NULL,
	[name] [varchar](50) NULL,
	[parentId] [int] NULL,
 CONSTRAINT [PK_SecondH] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[record]    Script Date: 04/08/2018 16:05:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[record](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[address] [nvarchar](50) NULL,
	[createDate] [datetime] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[province]    Script Date: 04/08/2018 16:05:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[province](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](30) NULL,
	[postcode] [varchar](30) NULL,
	[create_date] [datetime] NULL,
 CONSTRAINT [PK_province] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[FirstX]    Script Date: 04/08/2018 16:05:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[FirstX](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](50) NULL,
 CONSTRAINT [PK_FirstX] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[FirstH]    Script Date: 04/08/2018 16:05:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[FirstH](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](50) NULL,
 CONSTRAINT [PK_FirstH] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[code]    Script Date: 04/08/2018 16:05:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[code](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[code_name] [nvarchar](50) NULL,
	[code_num] [nvarchar](50) NULL,
 CONSTRAINT [PK_code] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[city]    Script Date: 04/08/2018 16:05:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[city](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](30) NULL,
	[postcode] [varchar](30) NULL,
	[create_date] [datetime] NULL,
	[province_id] [int] NULL,
 CONSTRAINT [PK_city] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[admin]    Script Date: 04/08/2018 16:05:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[admin](
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
	[code] [nvarchar](50) NULL,
	[name] [nvarchar](50) NULL,
	[id_number] [nvarchar](50) NULL,
	[sex] [nvarchar](50) NULL,
	[provinceId] [int] NULL,
	[cityId] [int] NULL,
	[unit] [nvarchar](50) NULL,
	[direction] [nvarchar](50) NULL,
	[industry] [nvarchar](50) NULL,
	[levels] [nvarchar](50) NULL,
	[title] [nvarchar](50) NULL,
	[address] [nvarchar](50) NULL,
	[postal] [nvarchar](50) NULL,
	[phone] [nvarchar](50) NULL,
	[telephone] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[qq] [nvarchar](50) NULL,
	[msn] [nvarchar](50) NULL,
	[status] [int] NULL,
 CONSTRAINT [PK_admin_1] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Default [DF_admin_status]    Script Date: 04/08/2018 16:05:31 ******/
ALTER TABLE [dbo].[admin] ADD  CONSTRAINT [DF_admin_status]  DEFAULT ((3)) FOR [status]
GO
/****** Object:  Default [DF_code_code_num]    Script Date: 04/08/2018 16:05:31 ******/
ALTER TABLE [dbo].[code] ADD  CONSTRAINT [DF_code_code_num]  DEFAULT ((2)) FOR [code_num]
GO
/****** Object:  Default [DF_T_DCWJXX_SFSH]    Script Date: 04/08/2018 16:05:31 ******/
ALTER TABLE [dbo].[T_DCWJXX] ADD  CONSTRAINT [DF_T_DCWJXX_SFSH]  DEFAULT ((0)) FOR [SFSH]
GO
/****** Object:  Default [DF_T_DCWJXX_XKFL]    Script Date: 04/08/2018 16:05:31 ******/
ALTER TABLE [dbo].[T_DCWJXX] ADD  CONSTRAINT [DF_T_DCWJXX_XKFL]  DEFAULT ((0)) FOR [XKFL1]
GO
/****** Object:  Default [DF_T_DCWJXX_XKFL2]    Script Date: 04/08/2018 16:05:32 ******/
ALTER TABLE [dbo].[T_DCWJXX] ADD  CONSTRAINT [DF_T_DCWJXX_XKFL2]  DEFAULT ((0)) FOR [XKFL2]
GO
/****** Object:  Default [DF_T_DCWJXX_XKFL3]    Script Date: 04/08/2018 16:05:32 ******/
ALTER TABLE [dbo].[T_DCWJXX] ADD  CONSTRAINT [DF_T_DCWJXX_XKFL3]  DEFAULT ((0)) FOR [XKFL3]
GO
/****** Object:  Default [DF_T_DCWJXX_XQJSSSLY]    Script Date: 04/08/2018 16:05:32 ******/
ALTER TABLE [dbo].[T_DCWJXX] ADD  CONSTRAINT [DF_T_DCWJXX_XQJSSSLY]  DEFAULT ('无') FOR [XQJSSSLY]
GO
/****** Object:  Default [DF_T_DCWJXX_XQJSYYHY1]    Script Date: 04/08/2018 16:05:32 ******/
ALTER TABLE [dbo].[T_DCWJXX] ADD  CONSTRAINT [DF_T_DCWJXX_XQJSYYHY1]  DEFAULT ((0)) FOR [XQJSYYHY1]
GO
/****** Object:  Default [DF_T_DCWJXX_XQJSYYHY2]    Script Date: 04/08/2018 16:05:32 ******/
ALTER TABLE [dbo].[T_DCWJXX] ADD  CONSTRAINT [DF_T_DCWJXX_XQJSYYHY2]  DEFAULT ((0)) FOR [XQJSYYHY2]
GO
/****** Object:  Default [DF_T_DCWJXX_XQJSYYHY3]    Script Date: 04/08/2018 16:05:32 ******/
ALTER TABLE [dbo].[T_DCWJXX] ADD  CONSTRAINT [DF_T_DCWJXX_XQJSYYHY3]  DEFAULT ((0)) FOR [XQJSYYHY3]
GO
