import { CardItem } from "@/components/card/cardItem"

export default function Home(){
  const item = {name: "douglas", imgUrl: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLi_HguYoTIuH6mtavKgeQvdG3nIHDW8jyGA&s", date:new Date()}

  return(
    <div>
        <CardItem name="oi" imgUrl={item.imgUrl} date={item.date} />
    </div>
  )
} 