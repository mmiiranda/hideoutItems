'use client'

type Props = { 
    name: string;
    imgUrl: string;
    date: Date
}

function formatDate(date : Date) {
    const today = new Date();

    const isToday =
        date.getDate() === today.getDate()&&
        date.getMonth() === today.getMonth() &&
        date.getFullYear() === today.getFullYear();


    const yesterday = new Date(today);
    yesterday.setDate(today.getDate() - 1); 

    const isYesterday =
        date.getDate() === yesterday.getDate() &&
        date.getMonth() === yesterday.getMonth() &&
        date.getFullYear() === yesterday.getFullYear();

    if (isYesterday) return "Yesterday";
    if (isToday) return "Today";

    return date.toLocaleDateString(undefined, {
        month: "numeric",
        day: "numeric"
    });
}

export function CardItem(props: Props){
    return (
        <div className="bg-white flex flex-col w-64 shadow-lg cursor-pointer">
            <div className="h-64">
                <img src={props.imgUrl} alt={props.name} className="w-full h-full object-cover" />
            </div>
            <div className="flex justify-between px-5 py-4">
                <div className="font-bold"> {props.name}</div>
                <div className="color-[#a7a7a7]"> {formatDate(props.date)} </div>
            </div>
        </div>
    )
}       