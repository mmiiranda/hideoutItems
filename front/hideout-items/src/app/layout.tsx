import type { Metadata } from "next";
import "./globals.css";

export const metadata: Metadata = {
  title: "Hideout Items | Menu", 
  description: "Generated by create next app",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body
        className="min-h-[100dvh] bg-[#f0f2f5]"
      >
        <header 
          className="top-0 w-full border-b-2 bg-white border-black px-8 py-4 flex justify-between mb-2 shadow"
        >
          <div>
            <img src="Logo.svg" alt="logo"  className="size-11"/>
          </div>
          <div>Infos</div>
        </header>
        {children}
      </body>
    </html>
  );
}
